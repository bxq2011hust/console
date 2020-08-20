package console.contract;

import console.account.AccountManager;
import console.common.DeployContractManager;
import org.fisco.bcos.web3j.protocol.Web3j;
import org.fisco.bcos.web3j.tx.gas.StaticGasProvider;

public interface ContractFace {

    void setGroupID(int groupID);

    void setWeb3j(Web3j web3j);

    void setGasProvider(StaticGasProvider gasProvider);

    void setDeployContractManager(DeployContractManager deployContractManager);

    DeployContractManager getDeployContractManager();

    void setAccountManager(AccountManager accountManager);

    void deploy(String[] params) throws Exception;

    void call(String[] params) throws Exception;

    void deployByCNS(String[] params) throws Exception;

    void callByCNS(String[] params) throws Exception;

    void queryCNS(String[] params) throws Exception;

    void getDeployLog(String[] params) throws Exception;

    void listAbi(String[] params) throws Exception;
}
