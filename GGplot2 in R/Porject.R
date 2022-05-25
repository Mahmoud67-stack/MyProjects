# install libraries then importing them
install.packages("ggplot2")
install.packages("scales") 
install.packages("ggthemes") 
library(ggplot2)
library(scales)
library(ggthemes)

setwd("D:/2021-2022/MTH243") #setting the working directory to the current one
# import data
data <- read.csv('data.csv', stringsAsFactors = TRUE) #Changing categorical data from strings to 
#numbers/factors so we can apply ggplot functions more smoothly on them

# view first 5 rows
head(data)
# check structure
str(data)

# As seen in the output are 1470 observations with 35 employee variables. Let's start visual #1.

#Visual #1
#Lets say the HR wants to know how monthly income is related to employee attrition by job role.

# For this problem, 'JobRole' is our X variable (discrete) and 'MonthlyIncome' is our Y variable 
# (continuous). 'Attrition' (yes/no) is our z variable.



#We will use geom_bar(). On the cheat sheet, it's listed as geom_bar(stat = 'identity'). 
#This would give us total monthly income of all employees. 
#We instead want average, so we insert (stat = 'summary', fun = mean).

#Step 1. Data, Aesthetics, Geoms
ggplot(data, aes(x = JobRole, y = MonthlyIncome, fill=Attrition)) +
  geom_bar(stat = 'summary', fun = mean) #Gives mean monthly income
# We obviously can't read the names, which leads us to step 2.

# Step 2. Coordinates and Position Adjustments
# When names are too long, it often helps to flip the x and y axis.
# un-stack bars and flipping axis
ggplot(data, aes(x = JobRole, y = MonthlyIncome, fill=Attrition)) +
  geom_bar(stat = 'summary', fun = mean, position = 'dodge') + #un-stack the bars to better 
  #compare Attrition, by adding position = 'dodge' within geom_bar()
  coord_flip() #to flip the x and y axis. To do so, we will add coord_flip() as a layer

#Step 3. Reorder bars from highest to lowest
# Now we will reorder the bars from highest to lowest Monthly Income to help us better analyze by Job
# Role.
# reordering job role
ggplot(data, aes(x = reorder(JobRole, MonthlyIncome), y = MonthlyIncome, fill = Attrition)) +
  geom_bar(stat = 'summary', fun = mean, position = 'dodge') +
  coord_flip()

#Step 4. Change bar colors and width
# Let's change the bar colors to "match the company brand." This must be done manually, 
# so find scale_fill_manual() on side 2 of the cheat sheet, under "Scales." 
# It lists colors in base R. You can try some, but they aren't "company colors." 
# We obtained the color #s below from color-hex.com .
# We will also narrow the bar widths by adding 'width=.8' within geom_bar() to add visually-appealing
# space.
ggplot(data, aes(x = reorder(JobRole, MonthlyIncome), y = MonthlyIncome, fill = Attrition)) +
  geom_bar(stat='summary', fun=mean, width=.8, position='dodge') +
  coord_flip() +
  scale_fill_manual(values = c('#96adbd', '#425e72'))

#Step 5. Title and Axis Labels
# Now let's add Title and Labels. We don't need an x label since the 
# job titles explain themselves.
ggplot(data, aes(x = reorder(JobRole, MonthlyIncome), y = MonthlyIncome, fill = Attrition)) +
  geom_bar(stat='summary', fun=mean, width=.8, position='dodge') +
  coord_flip() +
  scale_fill_manual(values = c('#96adbd', '#425e72')) +
  xlab(' ') +  #Removing x label
  ylab('Monthly Income in USD') +
  ggtitle('Employee Attrition by Job Role & Income')

#Step 6. Add Theme
# We will add a theme layer at the end of our code
ggplot(data, aes(x = reorder(JobRole, MonthlyIncome), y = MonthlyIncome, fill = Attrition)) +
  geom_bar(stat='summary', fun=mean, width=.8, position='dodge') +
  coord_flip() +
  scale_fill_manual(values = c('#96adbd', '#425e72')) +
  xlab(' ') +  #Removing x label
  ylab('Monthly Income in USD') +
  ggtitle('Employee Attrition by Job Role & Income')+
  theme_clean() #Adding theme after title

#Step 7. Reduce graph height and make outlines invisible
# We will remove the graph and legend outlines also the graph seems tall, 
# So let's reduce the height via aspect.ratio within theme()
ggplot(data, aes(x = reorder(JobRole, MonthlyIncome), y = MonthlyIncome, fill = Attrition)) +
  geom_bar(stat='summary', fun=mean, width=.8, position='dodge') +
  coord_flip() +
  scale_fill_manual(values = c('#96adbd', '#425e72')) +
  xlab(' ') +
  ylab('Monthly Income in USD') +
  ggtitle('Employee Attrition by Job Role & Income') +
  theme_clean() +
  theme(aspect.ratio = .65,
        plot.background = element_rect(color = 'white'),
        legend.background = element_rect(color = 'white'))


##Visual #2
# For the second visual, we want to know if employee attrition has any relationship to monthly 
# income, years since last promotion, and work-life balance. Another multivariate analysis.

#Step 1. Data, Aesthetics, Geoms
# For this problem, 'MonthlyIncome' is our X and 'YearsSinceLastPromotion' is our Y variable. 
# Both are continuous.For visualization context, we will use geom_smooth(), a regression 
# line often added to scatter plots to reveal patterns. 'Attrition' will again be 
# differentiated by color.
ggplot(data, aes(x=MonthlyIncome, y=YearsSinceLastPromotion, color=Attrition)) +
  geom_smooth(se = FALSE) #se = False removes confidence shading

# We can see that employees who leave are promoted less often. Let's delve deeper and compare 
# by work-life balance. For this 4th variable, we need to use 'Faceting' to view subplots by 
# work-life balance level.

#Step 2. Faceting to add subplots to the canvas
# We will use facet_wrap() for a rectangular layout.
ggplot(data, aes(x = MonthlyIncome, y = YearsSinceLastPromotion, color=Attrition)) +
  geom_smooth(se = FALSE) +
  facet_wrap(WorkLifeBalance~.)

#The facet grids look good, but what do the numbers mean? The data description explains the 
#codes for 'WorkLifeBalance': 1 = 'Bad', 2 = 'Good', 3 = 'Better', 4 = 'Best'. 
# Add them in step 3.

#Step 3. Add Labels to Facet Subplots
# To add subplot labels, we need to first define the names with a character vector, 
# then use the 'labeller' function within facet_wrap.
# define WorkLifeBalance values
wlb.labs <- c('1' = 'Bad Balance', '2' = 'Good Balance', '3' = 'Better Balance', '4' = 'Best Balance')
#Add values to facet_wrap()
ggplot(data, aes(x = MonthlyIncome, y = YearsSinceLastPromotion, color=Attrition)) +
  geom_smooth(se = FALSE) +
  facet_wrap(WorkLifeBalance~., 
             labeller = labeller(WorkLifeBalance = wlb.labs))

#Step 4. Labels and Title
# Add your labels and title at the end of your code.
ggplot(data, aes(x = MonthlyIncome, y = YearsSinceLastPromotion, color=Attrition)) +
  geom_smooth(se = FALSE) + facet_wrap(WorkLifeBalance~.,
           labeller = labeller(WorkLifeBalance = wlb.labs))+
  xlab('Monthly Income') +
  ylab('Years Since Last Promotion') +
  ggtitle('Employee Attrition by Workplace Factors')

#Step 5. Add Space Between Labels and Tick Markers
# When we look at the graph, the x and y labels seem too close to the tick markers. 
# A simple trick is to insert newline (\n) code within label names.
ggplot(data, aes(x = MonthlyIncome, y = YearsSinceLastPromotion, color=Attrition)) +
  geom_smooth(se = FALSE) + facet_wrap(WorkLifeBalance~.,
                                       labeller = labeller(WorkLifeBalance = wlb.labs))+
  xlab('\nMonthly Income') +  #Adds space above label
  ylab('Years Since Last Promotion\n')+  #Adds space below label
  ggtitle('Employee Attrition by Workplace Factors')
  
#Step 6. Theme
# When we installed library('ggthemes'), it gave you more options. 
# For a modern look, I went with theme_fivethirtyeight(). Simply add at the end.
  ggplot(data, aes(x = MonthlyIncome, y = YearsSinceLastPromotion, color=Attrition)) +
    geom_smooth(se = FALSE) + facet_wrap(WorkLifeBalance~.,
                                         labeller = labeller(WorkLifeBalance = wlb.labs))+
    xlab('\nMonthly Income') +
    ylab('Years Since Last Promotion\n') +
  ggtitle('Employee Attrition by Workplace Factors')+
    theme_fivethirtyeight()
  
#Step 7. Override a Theme Default
# What happened to our x and y labels? Well, the default for theme_fivethirtyeight() 
# doesn't have labels. But we can easily override that with a second theme() layer 
# at the end of your code.
  ggplot(data, aes(x = MonthlyIncome, y = YearsSinceLastPromotion, color=Attrition)) +
    geom_smooth(se = FALSE) + facet_wrap(WorkLifeBalance~.,
                                         labeller = labeller(WorkLifeBalance = wlb.labs))+
    xlab('\nMonthly Income') +
    ylab('Years Since Last Promotion\n') +
    ggtitle('Employee Attrition by Workplace Factors')+
    theme_fivethirtyeight()+
    theme(axis.title = element_text())

#Step 8. Add Space Between Grids and Change Legend Location
# Adding space between top and bottom grids and changing the legend location both 
# occur within the second theme() line.
  ggplot(data, aes(x = MonthlyIncome, y = YearsSinceLastPromotion, color=Attrition)) +
    geom_smooth(se = FALSE) + facet_wrap(WorkLifeBalance~.,
                                         labeller = labeller(WorkLifeBalance = wlb.labs))+
    xlab('\nMonthly Income') +
    ylab('Years Since Last Promotion\n') +
    ggtitle('Employee Attrition by Workplace Factors')+
    theme_fivethirtyeight() +
    theme(axis.title = element_text(),
          legend.position = 'top',
          legend.justification = 'left',
          panel.spacing = unit(1.5, 'lines'))
  
#Step 9. Change Line Color
# It would be awesome to change line colors to give it more informative appearance. Standard 
# R colors don't quite meet our needs. We will change manually just like we did with Visual #1.
# We obtained the colors #s from color-hex.com, which has become a useful tool for us.
  ggplot(data, aes(x = MonthlyIncome, y = YearsSinceLastPromotion, color=Attrition)) +
    geom_smooth(se = FALSE) +
    facet_wrap(WorkLifeBalance~., 
               labeller = labeller(WorkLifeBalance = wlb.labs)) +
    xlab('\nMonthly Income') +  
    ylab('Years Since Last Promotion\n') +
    ggtitle('Employee Attrition by Workplace Factors') +
    theme_fivethirtyeight() +
    theme(axis.title = element_text(),
          legend.position = 'top',
          legend.justification = 'left',
          panel.spacing = unit(1.5, 'lines')) +
    scale_color_manual(values = c('#999999','#ffb500'))

# We see that employees in roles lacking work-life balance seem to stay if promotions 
# are more frequent. The difference in attrition is less noticeable in good or higher
# work-life balance levels.  