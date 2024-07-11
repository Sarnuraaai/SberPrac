package dataContainer;

public class InheritedClass1 extends InheritedAnnotatedClass {

    @RepeatableAnnotation(hours = 1, prior = 1, details = "Prior1")
    public <T extends DataContainer> int method1(T data) {
        System.out.println("id: " + data.getId());
        return data.getId();
    }

    @RepeatableAnnotation(hours = 2, prior = 1, details = "Prior1")
    public <T extends DataContainer> String method2(T data) {
        System.out.println("name: " + data.getName());
        return data.getName();
    }

    @RepeatableAnnotation(hours = 3, prior = 2, details = "Prior2")
    public <T extends DataContainer> boolean method3(T data) {
        System.out.println("onDuty: " + data.isOnDuty());
        return data.isOnDuty();
    }
}
