package onboarding_project.project.domain.model;

import java.util.Date;

public class ApplicationDocument {


    private Long id;
    private CreditApplication creditApplication;
    private String documentType;
    private String filePath;
    private Date uploadDate;


    
    public ApplicationDocument() {
    }


    
    public ApplicationDocument(Long id, CreditApplication creditApplication, String documentType, String filePath,
            Date uploadDate) {
        this.id = id;
        this.creditApplication = creditApplication;
        this.documentType = documentType;
        this.filePath = filePath;
        this.uploadDate = uploadDate;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public CreditApplication getCreditApplication() {
        return creditApplication;
    }
    public void setCreditApplication(CreditApplication creditApplication) {
        this.creditApplication = creditApplication;
    }
    public String getDocumentType() {
        return documentType;
    }
    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }
    public String getFilePath() {
        return filePath;
    }
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
    public Date getUploadDate() {
        return uploadDate;
    }
    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }



    
    
}
