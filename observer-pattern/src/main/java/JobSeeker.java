public class JobSeeker implements Observer{
    private String name;

    public JobSeeker(String name) {
        this.name = name;
    }

    @Override
    public void onJobPosted(JobPost job) {
        System.out.println("Hi " + name + "! New job Posted: " + job.getTitle());
    }

    @Override
    public void attach(Observer observer) {

    }

    @Override
    public void detach(Observer observer) {

    }

    @Override
    public void notify(JobPost jobPost) {

    }
}
