<?php

namespace CalculatorBundle\Entity;

class Calculator
{
    /**
     * @var float
     */

private $leftOperand;

    /**
     * @var float
     */

    private $rightOperand;

    /**
     * @var string
     */

    private $operator;

    /**
     * Calculator constructor.
     */
    public function __construct()
    {
    }


    /**
     * @return float
     */
    public function getRightOperand()
    {
        return $this->rightOperand;
    }

    /**
     * @param float $rightOperand
     */
    public function setRightOperand($rightOperand)
    {
        $this->rightOperand = $rightOperand;
    }

    /**
     * @return string
     */
    public function getOperator()
    {
        return $this->operator;
    }

    /**
     * @param string $operator
     */
    public function setOperator($operator)
    {
        $this->operator = $operator;
    }

    /**
     * @return float
     */
    public function getLeftOperand()
    {
        return $this->leftOperand;
    }

    /**
     * @param float $leftOperand
     */
    public function setLeftOperand($leftOperand)
    {
        $this->leftOperand = $leftOperand;
    }


}