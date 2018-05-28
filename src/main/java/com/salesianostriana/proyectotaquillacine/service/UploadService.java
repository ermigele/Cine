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
import com.salesianostriana.proyectotaquillacine.model.EntidadConFichero;
import com.salesianostriana.proyectotaquillacine.repo.EntidadConFicheroRepository;


/**
 * Servicio "nuclear" de la aplicación, que permite subir (y almacenar) una entidad
 * de forma conjunta con un fichero de imagen. 
 * 
 * @author luismi
 *
 */
@Service
public class UploadService {

	@Autowired
	EntidadConFicheroRepository entidadConFicheroRepo;

	@Autowired
	ImgurService imgurService;

	public boolean saveAndUpload(EntidadConFichero p, MultipartFile file) {

		boolean success = false;
		//TODO Mejorar la gestión de errores, usando el mecanismo de Spring
		try {
			RespuestaImagen r = imgurService
					.uploadToImgur(new Imagen(Base64.encodeBase64String(file.getBytes()), file.getOriginalFilename()));
			if (r != null) {
				if (r.getStatus() == 200) {
					p.setFileUrl(r.getData().getLink());
					entidadConFicheroRepo.save(p);
					success = true;
				}
			}
		} catch (IOException e) {
			success = false;
		}
		
		return success;

	}

	public List<EntidadConFichero> list() {
		return entidadConFicheroRepo.findAll();
	}

}
