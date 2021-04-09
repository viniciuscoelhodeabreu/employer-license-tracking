package br.com.vinicius.employerlicensetracking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.vinicius.employerlicensetracking.entity.EmployeeEntity;

@Repository
public interface IEmployeeRepository extends JpaRepository<EmployeeEntity, Integer>{

	@Query("select e from EmployeeEntity e where lower(e.nome) like :name")
	List<EmployeeEntity> findByNome(@Param("name") String name);
	
}
