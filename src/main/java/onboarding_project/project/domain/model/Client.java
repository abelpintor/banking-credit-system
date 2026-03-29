package onboarding_project.project.domain.model;

public class Client {


    private Long id;
    private User user;
    private String firstName;
    private String lastName;
    private Long creditScore;



    public Client() {
    }
    
    public Client(Long id, User user, String firstName, String lastName, Long creditScore) {
        this.id = id;
        this.user = user;
        this.firstName = firstName;
        this.lastName = lastName;
        this.creditScore = creditScore;
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
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Long getCreditScore() {
        return creditScore;
    }
    public void setCreditScore(Long creditScore) {
        this.creditScore = creditScore;
    }
    

    
    
}
