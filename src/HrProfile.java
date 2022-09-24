public class HrProfile extends CompanyProfile {

    private final String hrLastName;
    private final String hrFirstName;
    private final String hrEmail;



    public HrProfile(String hrCompanyName,
                     String hrLastName,
                     String hrFirstName,
                     String hrEmail) {
        super(hrCompanyName);
        this.hrLastName = hrLastName;
        this.hrFirstName = hrFirstName;
        this.hrEmail = hrEmail;
    }


    //Getters, toString:


    public String getHrLastName() {
        return hrLastName;
    }

    public String getHrFirstName() {
        return hrFirstName;
    }

    public String getHrEmail() {
        return hrEmail;
    }

    @Override
    public String toString() {
        return "HrProfile{" +
                "hrLastName='" + hrLastName + '\'' +
                ", hrFirstName='" + hrFirstName + '\'' +
                ", hrEmail='" + hrEmail + '\'' +
                '}';
    }
}
