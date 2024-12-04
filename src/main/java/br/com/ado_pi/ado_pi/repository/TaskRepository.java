package br.com.ado_pi.ado_pi.repository;

import br.com.ado_pi.ado_pi.model.TaskModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<TaskModel, Integer> {

}
