package spcbl.org.bd.osp.service;

import org.springframework.stereotype.Service;
import spcbl.org.bd.osp.model.DwReport;
import spcbl.org.bd.osp.repository.DwReportRepo;

import java.util.List;
@Service
public class DwReportImp implements DwReportService{
    private final DwReportRepo dwReportRepo;

    public DwReportImp(DwReportRepo dwReportRepo) {
        this.dwReportRepo = dwReportRepo;
    }

    @Override
    public List<DwReport> dwReport() {

        return this.dwReportRepo.findAll();
    }
}
