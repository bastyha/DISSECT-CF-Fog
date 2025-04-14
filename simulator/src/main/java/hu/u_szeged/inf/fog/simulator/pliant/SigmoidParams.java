package hu.u_szeged.inf.fog.simulator.pliant;

public class SigmoidParams {
    public Double priceLambda;
    public Double priceShift;
    public Double loadOfResourceLambda;
    public Double loadOfResourceShift;
    public Double unprocessedDataLambda;
    public Double unprocessedDataShift;

    public SigmoidParams(Double priceLambda,
                         Double priceShift,
                         Double loadOfResourceLambda,
                         Double loadOfResourceShift,
                         Double unprocessedDataLambda,
                         Double unprocessedDataShift) {
        this.priceLambda = priceLambda;
        this.priceShift = priceShift;
        this.loadOfResourceLambda = loadOfResourceLambda;
        this.loadOfResourceShift = loadOfResourceShift;
        this.unprocessedDataLambda = unprocessedDataLambda;
        this.unprocessedDataShift = unprocessedDataShift;
    }
}
