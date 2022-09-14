package spcbl.org.bd.osp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spcbl.org.bd.osp.model.DailyProduction;


@Repository
public interface DailyProductionRepo extends JpaRepository<DailyProduction,Integer> {
}
