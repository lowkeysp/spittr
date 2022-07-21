package com.example.spittr;



import org.springframework.stereotype.Component;

import java.util.List;


@Component
public interface SpittleRepository {

    List<Spittle> findSpittles(long max, int count);
}
