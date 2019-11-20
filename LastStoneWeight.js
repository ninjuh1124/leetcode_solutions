var lastStoneWeight = function(stones) {
    if (stones.length == 0) return 0;
    if (stones.length == 1) return stones[0];
    
    stones.sort((a,b) => b-a);
    
    if (stones[0] == stones[1]) {
        stones.shift();
        stones.shift();
        return lastStoneWeight(stones);
    } else {
        let x = stones.shift();
        stones[0] = x - stones[0];
        return lastStoneWeight(stones);
    }
};
