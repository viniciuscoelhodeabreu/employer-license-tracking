package br.com.vinicius.employerlicensetracking.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(schema = "geral", name = "funcionario_squad")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class EmployeeSquadEntity implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GenericGenerator(
	        name = "employeeSquadSequenceGenerator",
	        strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
	        parameters = {
	                @Parameter(name = "sequence_name", value = "FUNCIONARIO_SQUAD_SEQUENCE"),
	                @Parameter(name = "initial_value", value = "1"),
	                @Parameter(name = "increment_size", value = "1")
	        }
	)
	@GeneratedValue(generator = "employeeSquadSequenceGenerator")
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "funcionario_id")
	private @NonNull EmployeeEntity employee;
	
	@ManyToOne
	@JoinColumn(name = "squad_id")
	private @NonNull SquadEntity squad;
	
}
