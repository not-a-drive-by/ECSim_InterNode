package edu.boun.edgecloudsim.edge_orchestrator;

import edu.boun.edgecloudsim.edge_server.EdgeDataCenter;
import edu.boun.edgecloudsim.edge_server.EdgeServerManager;
import edu.boun.edgecloudsim.edge_server.EdgeVM;
import edu.boun.edgecloudsim.network.Channel;
import edu.boun.edgecloudsim.network.NetworkModel;
import edu.boun.edgecloudsim.task_generator.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomEdgeOrchestrator extends EdgeOrchestrator {

    private Random r = new Random();

    public RandomEdgeOrchestrator( EdgeServerManager edgeServerManager ){
        this.EdgeServers = edgeServerManager.getEdgeServersList();
    }

    public void clearPrematchTasks(){
        preMatchTasks.clear();
    }

    @Override
    public void Matching(NetworkModel networkModel){
        for ( Task task : preMatchTasks ){
            if( task.getPreferenceList().size()!=0 ){

                int ran = r.nextInt( task.getPreferenceList().size() );
                task.setTargetServer(task.getPreferenceList().get(ran));

//                EdgeDataCenter target = null;
//                double min_dis = Double.MAX_VALUE;
//                for(EdgeDataCenter server : task.getPreferenceList()){
//                    Channel chan = networkModel.serachChannelByDeviceandServer(task.device.getMobileID(),
//                            server.getId());
//                    target = chan.distance < min_dis ? server : target;
//                    min_dis = chan.distance < min_dis ? chan.distance : min_dis;
//
//                }
//                task.setTargetServer(target);

            }
        }

    }

    //无聊函数
    public List<Task> getPreMatchTasks() {   return preMatchTasks;   }
    public void setPreMatchTasks(List<Task> preMatchTasks) {    this.preMatchTasks = preMatchTasks;   }
}
