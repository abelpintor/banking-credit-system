package onboarding_project.project.application.usecase.client;

import onboarding_project.project.domain.model.Client;

public interface RegisterClientUseCase {
    Client execute(RegisterClientRequest request);


    public static class RegisterClientRequest {
        private String name;
        private String email;
        private String phoneNumber;

        public RegisterClientRequest(String name, String email, String phoneNumber) {
            this.name = name;
            this.email = email;
            this.phoneNumber = phoneNumber;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }
    }
}