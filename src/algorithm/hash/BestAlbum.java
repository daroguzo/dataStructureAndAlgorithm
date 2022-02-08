package algorithm.hash;

import java.util.*;

public class BestAlbum {
    public static void main(String[] args) {

        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};

        BestAlbum bestAlbum = new BestAlbum();
        for (int i : bestAlbum.solution(genres, plays)) {
            System.out.print(i + " ");
        }

    }

    public static class Music {
        String genre;
        int play;
        int index;

        public Music(String genre, int play, int index) {
            this.genre = genre;
            this.play = play;
            this.index = index;
        }
    }

    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> playCount = new LinkedHashMap<>();
        List<Music> musicList = new ArrayList<>();
        List<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < genres.length; i++) {
            Music music = new Music(genres[i], plays[i], i);
            musicList.add(music);
            playCount.put(music.genre, playCount.getOrDefault(music.genre, 0) + music.play);
        }

        List<Map.Entry<String, Integer>> genreList = new ArrayList<>(playCount.entrySet());

        musicList.sort((o1, o2) -> o2.play - o1.play);
        genreList.sort((o1, o2) -> o2.getValue() - o1.getValue());

        for (Map.Entry<String, Integer> sortedList : genreList) {
            int count = 0;
            for (Music music : musicList) {
                if (music.genre.equals(sortedList.getKey()) && count != 2) {
                    answerList.add(music.index);
                    count++;
                }
            }
        }

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }


        return answer;
    }
}
