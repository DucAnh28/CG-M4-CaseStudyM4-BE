package com.ducanh.casestudy.service.player;
import com.ducanh.casestudy.model.*;
import com.ducanh.casestudy.repository.player.IPerformanceRepository;
import com.ducanh.casestudy.repository.player.IPlayerRepository;
import com.ducanh.casestudy.repository.player.IPositionRepository;
import com.ducanh.casestudy.repository.player.IStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PlayerService implements IPlayerService{

    @Autowired
    private IPlayerRepository playerRepository;

    @Autowired
    private IPositionRepository positionRepository;

    @Autowired
    private IPerformanceRepository performanceRepository;

    @Autowired
    private IStatusRepository statusRepository;

    @Override
    public Iterable<Player> findAll() {
        return playerRepository.findAll();
    }

    @Override
    public Optional<Player> findById(Long id) {
        return playerRepository.findById(id);
    }

    @Override
    public Player save(Player player) {
        return playerRepository.save(player);
    }

    @Override
    public void remove(Long id) {
        playerRepository.deleteById(id);
    }

    @Override
    public Iterable<Position> findAllPosition() {
        return positionRepository.findAll();
    }

    @Override
    public Iterable<Performance> findAllPerformance() {
        return performanceRepository.findAll();
    }

    @Override
    public Iterable<Status> findAllStatus() {
        return statusRepository.findAll();
    }



    @Override
    public Iterable<Player> findAllByName(String name) {
        return playerRepository.findAllByNameContaining(name);
    }

    @Override
    public Page<Player> findPage(Pageable pageable) {
        return playerRepository.findAll(pageable);
    }

    @Override
    public Iterable<Player> sortPlayerSalaryAsc() {
        return playerRepository.sortPlayerSalaryAsc();
    }

    @Override
    public Iterable<Player> sortPlayerSalaryDesc() {
        return playerRepository.sortPlayerSalaryDesc();
    }

    @Override
    public Page<Player> findAllPage(Pageable pageable) {
        return playerRepository.findAll(pageable);
    }

    @Override
    public Page<Player> findPlayerByNameContaining(String name, Pageable pageable) {
      return playerRepository.findPlayerByNameContaining(name,pageable);
    }
//    @Override
//    public Page<Coach> findCoachByNameContaining(String name, Pageable pageable) {
//        return coachRepository.findCoachByNameContaining(name,pageable);
//    }


}
