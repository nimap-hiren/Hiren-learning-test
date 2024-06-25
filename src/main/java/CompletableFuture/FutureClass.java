//package CompletableFuture;
//
//import java.util.concurrent.CompletableFuture;
//import java.util.concurrent.ExecutionException;
//
//public class FutureClass {
//
//    public static void main(String[] args) throws ExecutionException, InterruptedException {
//
//        CompletableFuture<String> greetingFuture
//                = CompletableFuture.supplyAsync(() -> {
//            // some async computation
//            return "Hello from CompletableFuture";
//        });
//
//        System.out.println(greetingFuture.get());
//
//        CompletableFuture<String> helloFuture = CompletableFuture.supplyAsync(() ->
//        {
//            return "Method 1";
//        });
//        CompletableFuture<String> combinedFuture = CompletableFuture.supplyAsync(() -> {
//            return ""
//        });
//
//    }
//}
