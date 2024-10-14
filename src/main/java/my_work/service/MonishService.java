package my_work.service;

import my_work.entity.WorkEntity;

import java.util.List;

public interface MonishService
{
    WorkEntity createData(WorkEntity datas);

    List<WorkEntity> getALLData();
}
