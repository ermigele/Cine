package com.salesianostriana.proyectotaquillacine.service;

import java.io.IOException;
import java.util.List;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.salesianostriana.proyectotaquillacine.imgur.Imagen;
import com.salesianostriana.proyectotaquillacine.imgur.ImgurService;
import com.salesianostriana.proyectotaquillacine.imgur.RespuestaImagen;
import com.salesianostriana.proyectotaquillacine.model.Pelicula;
import com.salesianostriana.proyectotaquillacine.repo.PeliculaRepository;


@Service
public class PeliculaService {

	@Autowired
	private PeliculaRepository repositorio;
	
	@Autowired
	ImgurService imgurService;

	
	public Iterable <Pelicula> findAll() {
		return repositorio.findAll();
	}
		
	public Pelicula findOne(Long idPelicula) {
		return repositorio.findById(idPelicula).orElse(null);
	}
	
	public List<Pelicula> findByTitulo(String titulo){
		return repositorio.findByTituloContainingIgnoreCase(titulo);
	}
		
	public Pelicula save(Pelicula p) {
		return repositorio.save(p);
	}
		
	public Pelicula edit(Pelicula p) {
		return repositorio.save(p);
	}
		
	public Pelicula delete(Pelicula p) {
		Pelicula aBorrar = repositorio.findById(p.getIdPelicula()).orElse(null);
		if (aBorrar != null)
			repositorio.delete(p);
			
		return aBorrar;
	}
	
	public boolean saveAndUpload(Pelicula p, MultipartFile file) {

		boolean success = false;
		
		try {
			RespuestaImagen r = imgurService.uploadToImgur(new Imagen(Base64.encodeBase64String(file.getBytes()), file.getOriginalFilename()));
			if (r != null) {
				if (r.getStatus() == 200) {
					p.setEnlace(r.getData().getLink());
					repositorio.save(p);
					success = true;
				}
			}
		} catch (IOException e) {
			success = false;
		}
		
		return success;

	}

	
}
