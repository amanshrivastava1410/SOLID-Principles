package OCP;

class AreaCal {
    public double calculateArea(Shape shape) {
        return shape.area();
    }
}


//// Code that violtes the OCP Principle: AreaCal Class is tightly coupled to specific shape classes. To add new shapes, we need to modify this class, which violates OCP.

// class AreaCal {
//     public double calculateArea(Object shape) {
//         if (shape instanceof Circle) {
//             Circle circle = (Circle) shape;
//             return Math.PI * circle.area();
//         } else if (shape instanceof Rectangle) {
//             Rectangle rectangle = (Rectangle) shape;
//             return rectangle.area();
//         }
//         return 0;
//     }
// }
