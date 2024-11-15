package ISP;

interface Workable {
    void work();
}


// Code that violates the ISP Principle: Here, Worker interface forces all implementing classes (like Robot) to implement unnecessary methods, such as eat. This violates ISP, as Robot doesn't need an eat method.

// interface Worker {
//     void work();
//     void eat();
// }

// class Robot implements Worker {
//     public void work() {
//         System.out.println("Robot is working.");
//     }

//     public void eat() {
//         throw new UnsupportedOperationException("Robots don't eat.");
//     }
// }
