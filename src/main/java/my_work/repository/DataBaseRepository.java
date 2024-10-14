package my_work.repository;


import my_work.entity.WorkEntity;
import org.springframework.data.jpa.repository.JpaRepository;



public interface DataBaseRepository extends JpaRepository<WorkEntity, Integer>
{

}
