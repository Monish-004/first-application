package my_work.service.implementation;

import lombok.AllArgsConstructor;
import my_work.entity.WorkEntity;
import my_work.repository.DataBaseRepository;
import my_work.service.MonishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class MonishServiceImplementation implements MonishService
{

    private DataBaseRepository repository;

    @Override
    public WorkEntity createData(WorkEntity datas)
    {
        return repository.save(datas);
    }

    @Override
    public List<WorkEntity> getALLData() {
        return repository.findAll();
    }


}
