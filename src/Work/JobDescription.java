package Work;

public class JobDescription {
    private String jobTitle;

    public JobDescription(String jobTitle){
        this.jobTitle = jobTitle;
    }

    public void printJobTitle(){
        System.out.println(jobTitle);
    }
}

