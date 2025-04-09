package com.lta.sistemapagos;

import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.lta.sistemapagos.entities.Estudiante;
import com.lta.sistemapagos.repository.EstudianteRepository;
import com.lta.sistemapagos.repository.PagoRepository;

@SpringBootApplication
public class SistemaPagosBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaPagosBackendApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(EstudianteRepository estudianteRepository, PagoRepository pagoRepository){
		return args -> {
			estudianteRepository.save(Estudiante.builder()
			.id(UUID.randomUUID().toString())
			.nombre("Christian")
			.apellido("Ramirez")
			.codigo("1234")
			.programaId("LTA1")
			.build());

			estudianteRepository.save(Estudiante.builder()
			.id(UUID.randomUUID().toString())
			.nombre("Biaggio")
			.apellido("Ramirez")
			.codigo("12354")
			.programaId("LTA1")
			.build());

			estudianteRepository.save(Estudiante.builder()
			.id(UUID.randomUUID().toString())
			.nombre("Julen")
			.apellido("Ramirez")
			.codigo("1256634")
			.programaId("LTA1")
			.build());

			estudianteRepository.save(Estudiante.builder()
			.id(UUID.randomUUID().toString())
			.nombre("Raul")
			.apellido("Ramirez")
			.codigo("12349030")
			.programaId("LTA2")
			.build());
		};
	}

}
