package es.upv.grycap.tracer.model.besu;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.DynamicArray;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 1.4.1.
 */
@SuppressWarnings("rawtypes")
public class ChaimeleonTracer_V1 extends Contract {
    public static final String BINARY = "60c0604052601360809081527f436861696d656c656f6e5472616365725f56310000000000000000000000000060a0526001906200003e90826200010a565b503480156200004c57600080fd5b50600280546001600160a01b03191633179055620001d6565b634e487b7160e01b600052604160045260246000fd5b600181811c908216806200009057607f821691505b602082108103620000b157634e487b7160e01b600052602260045260246000fd5b50919050565b601f8211156200010557600081815260208120601f850160051c81016020861015620000e05750805b601f850160051c820191505b818110156200010157828155600101620000ec565b5050505b505050565b81516001600160401b0381111562000126576200012662000065565b6200013e816200013784546200007b565b84620000b7565b602080601f8311600181146200017657600084156200015d5750858301515b600019600386901b1c1916600185901b17855562000101565b600085815260208120601f198616915b82811015620001a75788860151825594840194600190910190840162000186565b5085821015620001c65787850151600019600388901b60f8161c191681555b5050505050600190811b01905550565b610e5980620001e66000396000f3fe608060405234801561001057600080fd5b50600436106100575760003560e01c80633a2fa8071461005c57806350ca54281461007257806384bab2f6146100925780639ed8177b146100a7578063f5f5ba72146100ba575b600080fd5b6000546040519081526020015b60405180910390f35b6100856100803660046109e2565b6100cf565b6040516100699190610a76565b6100a56100a0366004610ad8565b6104de565b005b6100856100b5366004610b0d565b6105ab565b6100c2610772565b6040516100699190610b2f565b6000546060908284111561013e5760405160016201f41360e51b0319815260206004820152602760248201527f737461727420706f736974696f6e2067726561746572207468616e2074686520604482015266656e64206f6e6560c81b60648201526084015b60405180910390fd5b8083106101a95760405160016201f41360e51b0319815260206004820152602f60248201527f656e6420706f736974696f6e206d757374206265206c657373207468616e206e60448201526e756d626572206f662074726163657360881b6064820152608401610135565b60006101b58585610b5f565b6101c0906001610b72565b905060006101f58760408051808201825260008082526020918201528151808301909252825182529182019181019190915290565b905060008267ffffffffffffffff8111156102125761021261093f565b60405190808252806020026020018201604052801561023b578160200160208202803683370190505b5090506000875b8481101561037d57600080828154811061025e5761025e610b85565b9060005260206000209060030201600201805461027a90610b9b565b80601f01602080910402602001604051908101604052809291908181526020018280546102a690610b9b565b80156102f35780601f106102c8576101008083540402835291602001916102f3565b820191906000526020600020905b8154815290600101906020018083116102d657829003601f168201915b5050505050905060006103366103308360408051808201825260008082526020918201528151808301909252825182529182019181019190915290565b87610804565b90508015610368578285858151811061035157610351610b85565b602090810291909101015261036584610bd5565b93505b5050808061037590610bd5565b915050610242565b5060008167ffffffffffffffff8111156103995761039961093f565b6040519080825280602002602001820160405280156103cc57816020015b60608152602001906001900390816103b75790505b50905060005b828110156104d05760008482815181106103ee576103ee610b85565b60200260200101518154811061040657610406610b85565b9060005260206000209060030201600201805461042290610b9b565b80601f016020809104026020016040519081016040528092919081815260200182805461044e90610b9b565b801561049b5780601f106104705761010080835404028352916020019161049b565b820191906000526020600020905b81548152906001019060200180831161047e57829003601f168201915b50505050508282815181106104b2576104b2610b85565b602002602001018190525080806104c890610bd5565b9150506103d2565b509998505050505050505050565b6002546001600160a01b031633146104f557600080fd5b60408051606081018252428082526020820190815291810183815260008054600181018255908052825160039091027f290decd9548b62a8d60345a988386fc84ba6bc95484008f6362f93160ef3e563810191825593517f290decd9548b62a8d60345a988386fc84ba6bc95484008f6362f93160ef3e5648501559051919290917f290decd9548b62a8d60345a988386fc84ba6bc95484008f6362f93160ef3e565909101906105a59082610c3d565b50505050565b6000546060908084101561073c57828160016105c78388610b72565b6105d19190610b5f565b11156105ef576105e18583610b5f565b6105ec906001610b72565b90505b60008167ffffffffffffffff81111561060a5761060a61093f565b60405190808252806020026020018201604052801561063d57816020015b60608152602001906001900390816106285790505b50905060005b828110156107315760006106578289610b72565b8154811061066757610667610b85565b9060005260206000209060030201600201805461068390610b9b565b80601f01602080910402602001604051908101604052809291908181526020018280546106af90610b9b565b80156106fc5780601f106106d1576101008083540402835291602001916106fc565b820191906000526020600020905b8154815290600101906020018083116106df57829003601f168201915b505050505082828151811061071357610713610b85565b6020026020010181905250808061072990610bd5565b915050610643565b50925061076c915050565b6040805160008082526020820190925290610767565b60608152602001906001900390816107525790505b509150505b92915050565b60606001805461078190610b9b565b80601f01602080910402602001604051908101604052809291908181526020018280546107ad90610b9b565b80156107fa5780601f106107cf576101008083540402835291602001916107fa565b820191906000526020600020905b8154815290600101906020018083116107dd57829003601f168201915b5050505050905090565b6020808301518351835192840151600093610822929184919061082b565b14159392505050565b60008085841161093257602084116108de5760008415610876576001610852866020610b5f565b61085d906008610cfd565b610868906002610e00565b6108729190610b5f565b1990505b83518116856108858989610b72565b61088f9190610b5f565b805190935082165b8181146108c9578784116108b15787945050505050610937565b836108bb81610e0c565b945050828451169050610897565b6108d38785610b72565b945050505050610937565b8383206108eb8588610b5f565b6108f59087610b72565b91505b8582106109305784822080820361091d576109138684610b72565b9350505050610937565b610928600184610b5f565b9250506108f8565b505b849150505b949350505050565b634e487b7160e01b600052604160045260246000fd5b600082601f83011261096657600080fd5b813567ffffffffffffffff808211156109815761098161093f565b604051601f8301601f19908116603f011681019082821181831017156109a9576109a961093f565b816040528381528660208588010111156109c257600080fd5b836020870160208301376000602085830101528094505050505092915050565b6000806000606084860312156109f757600080fd5b833567ffffffffffffffff811115610a0e57600080fd5b610a1a86828701610955565b9660208601359650604090950135949350505050565b6000815180845260005b81811015610a5657602081850181015186830182015201610a3a565b506000602082860101526020601f19601f83011685010191505092915050565b6000602080830181845280855180835260408601915060408160051b870101925083870160005b82811015610acb57603f19888603018452610ab9858351610a30565b94509285019290850190600101610a9d565b5092979650505050505050565b600060208284031215610aea57600080fd5b813567ffffffffffffffff811115610b0157600080fd5b61093784828501610955565b60008060408385031215610b2057600080fd5b50508035926020909101359150565b602081526000610b426020830184610a30565b9392505050565b634e487b7160e01b600052601160045260246000fd5b8181038181111561076c5761076c610b49565b8082018082111561076c5761076c610b49565b634e487b7160e01b600052603260045260246000fd5b600181811c90821680610baf57607f821691505b602082108103610bcf57634e487b7160e01b600052602260045260246000fd5b50919050565b600060018201610be757610be7610b49565b5060010190565b601f821115610c3857600081815260208120601f850160051c81016020861015610c155750805b601f850160051c820191505b81811015610c3457828155600101610c21565b5050505b505050565b815167ffffffffffffffff811115610c5757610c5761093f565b610c6b81610c658454610b9b565b84610bee565b602080601f831160018114610ca05760008415610c885750858301515b600019600386901b1c1916600185901b178555610c34565b600085815260208120601f198616915b82811015610ccf57888601518255948401946001909101908401610cb0565b5085821015610ced5787850151600019600388901b60f8161c191681555b5050505050600190811b01905550565b6000816000190483118215151615610d1757610d17610b49565b500290565b600181815b80851115610d57578160001904821115610d3d57610d3d610b49565b80851615610d4a57918102915b93841c9390800290610d21565b509250929050565b600082610d6e5750600161076c565b81610d7b5750600061076c565b8160018114610d915760028114610d9b57610db7565b600191505061076c565b60ff841115610dac57610dac610b49565b50506001821b61076c565b5060208310610133831016604e8410600b8410161715610dda575081810a61076c565b610de48383610d1c565b8060001904821115610df857610df8610b49565b029392505050565b6000610b428383610d5f565b600081610e1b57610e1b610b49565b50600019019056fea2646970667358221220a2849bf6b50a071fa66be6aac8707986e17c7a55195999b847dd47f65f15bbff64736f6c63430008100033";

    public static final String FUNC_ADDTRACE = "addTrace";

    public static final String FUNC_GETCONTRACTNAME = "getContractName";

    public static final String FUNC_GETTRACESBYVALUE = "getTracesByValue";

    public static final String FUNC_GETTRACESCOUNT = "getTracesCount";

    public static final String FUNC_GETTRACESSUBARRAY = "getTracesSubarray";

    @Deprecated
    protected ChaimeleonTracer_V1(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected ChaimeleonTracer_V1(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected ChaimeleonTracer_V1(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected ChaimeleonTracer_V1(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<TransactionReceipt> addTrace(String trace) {
        final Function function = new Function(
                FUNC_ADDTRACE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(trace)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<String> getContractName() {
        final Function function = new Function(FUNC_GETCONTRACTNAME, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<List> getTracesByValue(String value, BigInteger sP, BigInteger eP) {
        final Function function = new Function(FUNC_GETTRACESBYVALUE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(value), 
                new org.web3j.abi.datatypes.generated.Uint256(sP), 
                new org.web3j.abi.datatypes.generated.Uint256(eP)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Utf8String>>() {}));
        return new RemoteFunctionCall<List>(function,
                new Callable<List>() {
                    @Override
                    @SuppressWarnings("unchecked")
                    public List call() throws Exception {
                        List<Type> result = (List<Type>) executeCallSingleValueReturn(function, List.class);
                        return convertToNative(result);
                    }
                });
    }

    public RemoteFunctionCall<BigInteger> getTracesCount() {
        final Function function = new Function(FUNC_GETTRACESCOUNT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<List> getTracesSubarray(BigInteger startPos, BigInteger maxNumElems) {
        final Function function = new Function(FUNC_GETTRACESSUBARRAY, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(startPos), 
                new org.web3j.abi.datatypes.generated.Uint256(maxNumElems)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Utf8String>>() {}));
        return new RemoteFunctionCall<List>(function,
                new Callable<List>() {
                    @Override
                    @SuppressWarnings("unchecked")
                    public List call() throws Exception {
                        List<Type> result = (List<Type>) executeCallSingleValueReturn(function, List.class);
                        return convertToNative(result);
                    }
                });
    }

    @Deprecated
    public static ChaimeleonTracer_V1 load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new ChaimeleonTracer_V1(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static ChaimeleonTracer_V1 load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new ChaimeleonTracer_V1(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static ChaimeleonTracer_V1 load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new ChaimeleonTracer_V1(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static ChaimeleonTracer_V1 load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new ChaimeleonTracer_V1(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<ChaimeleonTracer_V1> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(ChaimeleonTracer_V1.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    public static RemoteCall<ChaimeleonTracer_V1> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(ChaimeleonTracer_V1.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<ChaimeleonTracer_V1> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(ChaimeleonTracer_V1.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<ChaimeleonTracer_V1> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(ChaimeleonTracer_V1.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }
}