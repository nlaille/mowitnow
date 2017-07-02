package com.mowitnow.automaton.lawnmover;

import com.mowitnow.map.OrientedPosition;

public interface Movement {
    OrientedPosition executeFrom(OrientedPosition orientedPosition);
}
