package com.study.redis.presentation;

import com.study.redis.application.RankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LeaderBoardController {

    @Autowired
    private RankingService rankingService;

    @GetMapping("/set-score")
    public Boolean setScore(
        @RequestParam String userId,
        @RequestParam int score
    ) {
        return rankingService.setUserScore(userId, score);
    }

    // 대충 스터디라 직관적이게 사용
    @GetMapping("/get-rank")
    public Long getUserRank(@RequestParam String userId) {
        return rankingService.getUserRanking(userId);
    }

    @GetMapping("/get-top-ranks")
    public List<String> getTopRanks() {
        return rankingService.getTopRank(3);
    }

}
