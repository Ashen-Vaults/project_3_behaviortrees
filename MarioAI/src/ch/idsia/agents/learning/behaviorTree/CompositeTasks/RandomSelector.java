/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.idsia.agents.learning.behaviorTree.CompositeTasks;

import ch.idsia.agents.Agent;
import ch.idsia.agents.controllers.BasicMarioAIAgent;
import ch.idsia.agents.learning.behaviorTree.Task;
import java.util.ArrayList;
import java.util.Random;

/**
 * Randomizes the order in which children are checked
 * @author Alexsh
 */
public class RandomSelector extends CompositeTask{
    private Random _random = new Random();
    public RandomSelector(BasicMarioAIAgent _agent, ArrayList<Task> _tasks) {
        super(_agent, _tasks);
    }
    @Override
    public boolean run(){
        while(true){
            this._current = this.myTasks.get(_random.nextInt(this.myTasks.size()));
            System.out.println("Running Task: " + this._current.getClass().getSimpleName());
            if(this._current.run()){
                return true;
            }
        }
    }
}
