using System;
using System.IO;
using System.Text;

// namespace Task540
// {
//   class Program
//   {
//     static void Main(string[] args)
//     {
      string FilePath = "Task300.java";
      using (FileStream stream =
            new FileStream(FilePath, FileMode.Open))
      {
        using (StreamReader reader =
            new StreamReader(stream,
            Encoding.UTF8))
        {
          int commentLen = 0;
          int totalLen = 0;
          while(!reader.EndOfStream)
          {
            string line = reader.ReadLine();
            line = line.Trim();
            //Підраховуємо загальну кількість символів
            totalLen += line.Length;
            //Вивід однострічкових коментарів
            if (line.Contains("//"))
            {
              int position = line.IndexOf("//");
              int endPositoin = line.Length;
              string comment = line.Substring(
                    position, endPositoin - position);
              Console.WriteLine(comment);
              //Підраховуємо довжину коментарів
              commentLen += comment.Length;
            }
            //Вивід багатосрічкових та блочних
            //коментарів
            if (line.Contains("/*"))
            {
              int position = line.IndexOf("/*");
              int endPositoin = line.IndexOf("*/")>0?
                    line.IndexOf("*/") + 2:line.Length;
              string comment = line.Substring(
                     position, endPositoin - position);
              Console.WriteLine(comment);
              //Підраховуємо довжину коментарів
              commentLen += comment.Length;
              while (!line.Contains("*/"))
              {
                line = reader.ReadLine();
                line = line.Trim();
             //Підраховуємо загальну кількість символів
                totalLen += line.Length;
                if (line.Contains("*/"))
                {
                  int length = line.IndexOf("*/");
                  //вибираємо з рядка лише коментар
                  comment = line.Substring(0, length+2);
                }
                else
                {
                  comment = line;
                }
                Console.WriteLine(comment);
                //Підраховуємо довжину коментарів
                commentLen += comment.Length;
              }
            }
          }
          int codeSymbols= totalLen - commentLen;
          Console.WriteLine( $"Довжина коду без " + 
                "коментарів {codeSymbols} символів");
          double codePercentage = 
                    (100.0 * codeSymbols) / totalLen;
          Console.WriteLine($"він становить " +
                  "{codePercentage} % тексту файла");
        }
      }
//     }
//   }
// }
