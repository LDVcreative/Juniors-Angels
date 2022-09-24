public class CompanyProfile {
    private String hrCompanyName; //The company in which HR-manager works



    //Getters, Setters, toString:

    public CompanyProfile(String hrCompanyName) {
        this.hrCompanyName = hrCompanyName;
    }

    public void setHrCompanyName(String hrCompanyName) {
        this.hrCompanyName = hrCompanyName;
    }

    @Override
    public String toString() {
        return "CompanyProfile{" +
                "hrCompanyName='" + hrCompanyName + '\'' +
                '}';
    }
}
