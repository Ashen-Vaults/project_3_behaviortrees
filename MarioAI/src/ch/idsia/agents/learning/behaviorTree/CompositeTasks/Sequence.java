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
import java.util.Iterator;

/**
 * 
 * @author Alexsh
 */
public class Sequence extends CompositeTask {
    
   
    
    
    public Sequence(BasicMarioAIAgent _agent, ArrayList<Task> _tasks) {
        super(_agent, _tasks);
    }

    @Override
    public boolean run() {
        
        //System.out.println("Current " + this._current.getClass().getSimpleName());
        
        if(this._currentTaskIter!=null && _current!=null){
            
            
            //if(this._currentTask.hasNext()){   
                
                //if the current task the last task in the list; we are done
                //if(_current == myTasks.get(myTasks.size()-1)){
                if(!this._currentTaskIter.hasNext()){
                    //System.out.println("LAST TASK:" + _current.getClass().getSimpleName());
                    //return true;
                    //System.out.println("Running:" + _current.getClass().getSimpleName()); 
                    return _current.run();                                      
                    //return true;
                }

               // if the current task's run return true, go to the next task
                if(_current.run()){                    
                    if(this._currentTaskIter.hasNext()){
                        System.out.println("Task Succeed:" + _current.getClass().getSimpleName());
                        _current = this._currentTaskIter.next();
                        System.out.println(" |\t| Next Task: "+_current.getClass().getSimpleName());
                    }
                    return true; //if the current task's run doesnt run, we are done
               
                
                
                }else{
                    return false;  
                }
            }
           // System.out.println("Current Tasks Does not have next: " + _current.getClass().getSimpleName());
           // return false;
        //}
        System.out.println("Repeating: ");
        return false;
        
            
          /*  
          for(int i=0;i<=this.myTasks.size()-1;i++)
          {
              if(!this.myTasks.get(i).run()){
                  
                   return false;
              }
              System.out.println("Running: " + this.myTasks.get(i).getClass().getSimpleName());
              
              
          }            
            return true;
     
        }
        */
          
             
    }
}
