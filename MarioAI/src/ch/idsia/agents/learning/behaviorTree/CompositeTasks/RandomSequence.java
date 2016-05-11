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
import java.util.Collections;
import java.util.Random;

/**
 * Randomizes the order in which the children of a sequence are executed
 * @author Alexsh
 */
public class RandomSequence extends Sequence{
    
    private Random _random = new Random();
    
    public RandomSequence(BasicMarioAIAgent _agent, ArrayList<Task> _tasks) {
        super(_agent, _tasks);
        System.out.println(this.getClass().getSimpleName() + " " + this.myTasks.size());
    }
    
    @Override
    public boolean run(){
        Collections.shuffle(this.myTasks);
        while(this._current != this.myTasks.get(this.myTasks.size()-1)){
            
             if(this._currentTaskIter.hasNext())
                this._current = this._currentTaskIter.next();
             if(!this._current.run()) return false;
        }
        return true;
    }
    
}
