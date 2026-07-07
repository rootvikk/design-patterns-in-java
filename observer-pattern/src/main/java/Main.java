public class Main {
    static void main() {
        JobSeeker seeker1 = new JobSeeker("Raj");
        JobSeeker seeker2 = new JobSeeker("Rani");

        EmployementAgency e = new EmployementAgency();
        e.attach(seeker1);
        e.attach(seeker2);

        e.addJob(new JobPost("Software Engineer"));
    }
}
