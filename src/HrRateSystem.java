public class HrRateSystem {

    private final int hrRateByUser; //Manager evaluation by the user
    private final String userCommentAboutHr; //User comment about communication with the manager

    public HrRateSystem(int hrRateByUser,
                        String userCommentAboutHr) {
        this.hrRateByUser = hrRateByUser;
        this.userCommentAboutHr = userCommentAboutHr;
    }

    //Getters:

    public int getHrRateByUser() {
        return hrRateByUser;
    }

    public String getUserCommentAboutHr() {
        return userCommentAboutHr;
    }
}
