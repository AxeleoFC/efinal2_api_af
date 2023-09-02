package com.example.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.repository.modelo.Estudiante;

@Repository
@Transactional
public class EstudianteRepositoryImpl implements IEstudianteReposiroty {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void ingresar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.persist(estudiante);
	}

	@Override
	public List<Estudiante> buscar() {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> query=this.entityManager.createQuery("SELECT e FROM Estudiante e", Estudiante.class);
		try {
			return query.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

}
