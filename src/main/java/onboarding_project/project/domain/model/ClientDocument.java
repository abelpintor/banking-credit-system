package onboarding_project.project.domain.model;

import java.util.Date;

public class ClientDocument {

    private Long id;
    private Client client;
    private String documentType;
    private String filePath;
    private Date uploadDate;




    public ClientDocument() {
    }

    public ClientDocument(Long id, Client client, String documentType, String filePath, Date uploadDate) {
        this.id = id;
        this.client = client;
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
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
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
