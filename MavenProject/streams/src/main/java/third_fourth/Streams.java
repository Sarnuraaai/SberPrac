package third_fourth;

import second.StreamContainer;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

    public void stringStream() {
        Stream<String> stream = Stream.of("Name1", "Name2", "Name3");

        Stream<StreamContainer> containerStream = stream.map(name -> {
            long count = (long) (Math.random() * 10);
            return new StreamContainer(name, count);
        });

        //containerStream.forEach(System.out::println);

        Map<String, Long> map = containerStream.collect(Collectors.toMap(StreamContainer::getName, StreamContainer::getCount));
        System.out.println(map);
    }

    public void mapStream() {
        Map<String, List<StreamContainer>> streamContainerMap = Stream.of("Name1", "Name2", "Name3")
                .collect(Collectors.toMap(
                                name -> name,
                                name -> Stream.generate(() -> new StreamContainer(name, (long) (Math.random() * 10)))
                                        .limit(3)
                                        .collect(Collectors.toList())
                        )
                );

        Stream<StreamContainer> unifiedStream = streamContainerMap.values().stream()
                .flatMap(List::stream);
        List<StreamContainer> allStreamContainers = unifiedStream.toList();

        System.out.println("\nСписок всех StreamContainer-ов:");
        allStreamContainers.forEach(System.out::println);

        long count = allStreamContainers.stream().count(); // allStreamContainers.size();
        System.out.println("\nКоличество элементов: " + count);
    }

//    public static void main(String[] args) {
//        Stream<String> stream = Stream.of("Name1", "Name2", "Name3");
//
//        Stream<StreamContainer> containerStream = stream.map(name -> {
//            long count = (long) (Math.random() * 10);
//            return new StreamContainer(name, count);
//        });
//
//        //containerStream.forEach(System.out::println);
//
//        Map<String, Long> map = containerStream.collect(Collectors.toMap(StreamContainer::getName, StreamContainer::getCount));
//        System.out.println(map);
//
//        Map<String, List<StreamContainer>> streamContainerMap = Stream.of("Name1", "Name2", "Name3")
//                .collect(Collectors.toMap(
//                                name -> name,
//                                name -> Stream.generate(() -> new StreamContainer(name, (long) (Math.random() * 10)))
//                                        .limit(3)
//                                        .collect(Collectors.toList())
//                        )
//                );
//
//        Stream<StreamContainer> unifiedStream = streamContainerMap.values().stream()
//                .flatMap(List::stream);
//        List<StreamContainer> allStreamContainers = unifiedStream.toList();
//
//        System.out.println("\nСписок всех StreamContainer-ов:");
//        allStreamContainers.forEach(System.out::println);
//
//        long count = allStreamContainers.stream().count(); // allStreamContainers.size();
//        System.out.println("\nКоличество элементов: " + count);
//    }
}
