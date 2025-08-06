package com.app.web.servicio;

import java.util.List;

import com.app.web.entidad.Estudiante;

public interface EstudianteServicio  {
	
	public List<Estudiante> listarTodosLosEstudiantes();
	
	public Estudiante guardarEstudiante( Estudiante estudiante);
	
	public Estudiante obtenerEstudiantePorId(Long id);
	
	public Estudiante EditarEstudiante(Estudiante estudiante);
	
	public void eliminarEstudiante( Long id);

	public void actualizarEstudiante(Long id, Estudiante estudiante);




}
