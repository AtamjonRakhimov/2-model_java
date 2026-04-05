package pdpuz;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TodoAppWithLogging {
    private static final Logger logger = Logger.getLogger(TodoAppWithLogging.class.getName());
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    private static final List<Task> tasks = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        logger.info("TODO App started...");

        addTask("Wake up", LocalDateTime.now().plusSeconds(5));
        addTask("Practice HTML for 1 hour", LocalDateTime.now().plusSeconds(10));
        addTask("Study CSS for 2 hours", LocalDateTime.now().plusSeconds(15));
        addTask("Have breakfast", LocalDateTime.now().plusSeconds(20));

        logger.info("All tasks successfully added.");

        while (true) {
            LocalDateTime now = LocalDateTime.now();
            for (Task task : tasks) {
                if (!task.isDone() && now.isAfter(task.time)) {
                    logger.log(Level.INFO, "Task time reached: " + task.description);
                    task.setDone(true);
                }
            }
            Thread.sleep(1000);
        }
    }

    private static void addTask(String description, LocalDateTime time) {
        tasks.add(new Task(description, time));
        logger.log(Level.INFO, "Task added: {0} | Time: {1}", new Object[]{description, time.format(formatter)});
    }

    static class Task {
        private String description;
        private LocalDateTime time;
        private boolean done;

        public Task(String description, LocalDateTime time) {
            this.description = description;
            this.time = time;
            this.done = false;
        }

        public boolean isDone() {
            return done;
        }

        public void setDone(boolean done) {
            this.done = done;
        }
    }
}
