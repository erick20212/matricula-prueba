package pe.edu.upeu.LP2_clase01.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.LP2_clase01.entity.Empleado;

public interface EmpleadoDao {

	Empleado create(Empleado c);
	Empleado update(Empleado c);
	void delete(Long id);
	Optional<Empleado> read(Long id);
	List<Empleado> readAll();

}
