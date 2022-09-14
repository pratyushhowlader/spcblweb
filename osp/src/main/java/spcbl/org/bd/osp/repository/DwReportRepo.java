package spcbl.org.bd.osp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spcbl.org.bd.osp.model.DwReport;

public interface DwReportRepo extends JpaRepository<DwReport,String> {
}
