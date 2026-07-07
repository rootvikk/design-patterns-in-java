public interface Observer {
    void onJobPosted(JobPost job);

    void attach(Observer observer);

    void detach(Observer observer);

    void notify(JobPost jobPost);
}
