select
		d.id,
		sum(case when d.month = 'Jan' then d.revenue else null end) "Jan_Revenue",
		sum(case when d.month = 'Feb' then d.revenue else null end) "Feb_Revenue",
		sum(case when d.month = 'Mar' then d.revenue else null end) "Mar_Revenue",
		sum(case when d.month = 'Apr' then d.revenue else null end) "Apr_Revenue",
		sum(case when d.month = 'May' then d.revenue else null end) "May_Revenue",
		sum(case when d.month = 'Jun' then d.revenue else null end) "Jun_Revenue",
		sum(case when d.month = 'Jul' then d.revenue else null end) "Jul_Revenue",
		sum(case when d.month = 'Aug' then d.revenue else null end) "Aug_Revenue",
		sum(case when d.month = 'Sep' then d.revenue else null end) "Sep_Revenue",
		sum(case when d.month = 'Oct' then d.revenue else null end) "Oct_Revenue",
		sum(case when d.month = 'Nov' then d.revenue else null end) "Nov_Revenue",
		sum(case when d.month = 'Dec' then d.revenue else null end) "Dec_Revenue"
		from department d
		group by d.id
		;