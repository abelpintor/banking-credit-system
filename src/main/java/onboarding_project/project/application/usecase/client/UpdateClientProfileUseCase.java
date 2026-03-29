

package onboarding_project.project.application.usecase.client;

import onboarding_project.project.domain.model.Client;

public interface UpdateClientProfileUseCase {

    Client execute(Long clientId, UpdateClientProfileRequest  updatedClient);

    public static class UpdateClientProfileRequest {
        private String name;
        private String email;
        private String phoneNumber;

        public UpdateClientProfileRequest() {
        }

        public UpdateClientProfileRequest(String name, String email, String phoneNumber) {
            this.name = name;
            this.email = email;
            this.phoneNumber = phoneNumber;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
    }
}