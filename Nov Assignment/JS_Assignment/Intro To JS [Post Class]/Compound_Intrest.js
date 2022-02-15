
function calculateCI(P, R, T)
{
    return (P * (Math.pow((1 + R / 100), T))-P).toFixed(2);
}