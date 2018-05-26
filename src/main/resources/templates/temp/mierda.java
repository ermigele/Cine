		//Limite de butacas - Datos que entran por el input de HTML
		int butacasXFila = nuevaSala.getNumButacaXFila();
		int numFilas = nuevaSala.getNumFila();
		
        List<Butaca> listaButaca = new ArrayList<Butaca>();
		//Bucleo de mapeo de las salas
		for(int i = 0; i<numFilas;i++) {
			for(int j=0; j< butacasXFila;j++) {
				
				int numFilaActual = i;
				int numButacaActual = j;
				
				Butaca newButaca = new Butaca();
			
				newButaca.setNumFila(numFilaActual);
				newButaca.setNumButacaXFila(numButacaActual);	
				
				listaButaca.add(newButaca);
			}
		}

        Sala sala = new Sala ();
		sala.setNombreSala(nuevaSala.getNombreSala()); // Asigno a la clase Sala la variable nombreSala que recogo del formulario
		sala.setListaButacas(listaButaca);
		salaService.save(sala); //Guardo la sala antes de empezar a meter las butacas
		
		




        Sala sala = new Sala();
		sala.setNombreSala(nuevaSala.getNombreSala()); // Asigno a la clase Sala la variable nombreSala que recogo del
														// formulario

		salaService.save(sala); // Guardo la sala antes de empezar a meter las butacas

		// Limite de butacas - Datos que entran por el input de HTML
		int butacasXFila = nuevaSala.getNumButacaXFila();
		int numFilas = nuevaSala.getNumFila();

		// Bucleo de mapeo de las salas
		for (int i = 0; i < numFilas; i++) {
			for (int j = 0; j < butacasXFila; j++) {

				int numFilaActual = i;
				int numButacaActual = j;

				Butaca newButaca = new Butaca();

				newButaca.setNumFila(numFilaActual);
				newButaca.setNumButacaXFila(numButacaActual);

				newButaca.setSala(sala);

				butacaService.save(newButaca); // Guardo las butacas
			}
		}