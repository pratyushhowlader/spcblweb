package spcbl.org.bd.osp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spcbl.org.bd.osp.model.WeaklyPlanning;

public interface WeaklyPlanningRepo extends JpaRepository<WeaklyPlanning,Integer> {
}
