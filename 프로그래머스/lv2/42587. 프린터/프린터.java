import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    static int solution(int[] priorities, int location) {

        Queue<Document> documents = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            documents.add(new Document(i, priorities[i], i == location));
        }

        int count = 0;
        while (!documents.isEmpty()) {
            Document maxDocument = Collections.max(documents, (o1, o2) -> o1.getPrioritiy() - o2.getPrioritiy());
            Document currentDocument = documents.poll();

            if (maxDocument.getPrioritiy() == currentDocument.getPrioritiy()) {
                count++;

                if (currentDocument.requested) {
                    break;
                }
            } else {
                documents.add(currentDocument);
            }
        }


        int answer = count;
        return answer;
    }

    static class Document {
        private int id;
        private int prioritiy;
        private boolean requested;

        public Document(int id, int prioritiy, boolean requested) {
            this.id = id;
            this.prioritiy = prioritiy;
            this.requested = requested;
        }

        public int getId() {
            return id;
        }

        public int getPrioritiy() {
            return prioritiy;
        }

        public boolean isRequested() {
            return requested;
        }
    }
}