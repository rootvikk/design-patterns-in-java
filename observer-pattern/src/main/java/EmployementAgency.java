import java.util.ArrayList;
import java.util.List;

public class EmployementAgency implements Observable{
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notify(JobPost jobPost) {
        for (Observer observer : observers) {
            observer.onJobPosted(jobPost);
        }
    }

    public void addJob(JobPost jobPosting) {
        notify(jobPosting);
    }
}
