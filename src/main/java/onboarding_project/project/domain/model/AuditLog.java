package onboarding_project.project.domain.model;

import java.util.Date;

public class AuditLog {


    private Long id;
    private User user;
    private String action;
    private String entityType;
    private Long entityId;
    private String details;
    private Date createdAt;

    public AuditLog() {
    }


    public AuditLog(Long id, User user, String action, String entityType, Long entityId, String details,
            Date createdAt) {
        this.id = id;
        this.user = user;
        this.action = action;
        this.entityType = entityType;
        this.entityId = entityId;
        this.details = details;
        this.createdAt = createdAt;
    }
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public String getAction() {
        return action;
    }
    public void setAction(String action) {
        this.action = action;
    }
    public String getEntityType() {
        return entityType;
    }
    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }
    public Long getEntityId() {
        return entityId;
    }
    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }
    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details;
    }
    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    

    
}
